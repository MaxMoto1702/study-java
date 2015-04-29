package name.maxserebryanskiy.study.spring.social.config;

import name.maxserebryanskiy.study.spring.social.controller.HHController;
import name.maxserebryanskiy.study.spring.social.service.HHService;
import name.maxserebryanskiy.study.spring.social.service.impl.HHServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestOperations;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by maksim.serebryanskiy on 28.04.2015.
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(WebMvcConfig.class);

    @Bean
    public HHServiceImpl hhService(@Qualifier("hhRestTemplate") RestOperations hhRestTemplate) {
        HHServiceImpl sparklrService = new HHServiceImpl();
        sparklrService.setHhRestTemplate(hhRestTemplate);
        return sparklrService;
    }

    @Bean
    public HHController hhController(@Qualifier("hhService") HHService hhService) {
        HHController controller = new HHController();
        controller.setHhService(hhService);
        return controller;
    }

    @Configuration
    @EnableOAuth2Client
    protected static class ResourceConfiguration {

        @Bean
        public OAuth2ProtectedResourceDetails hh() {
            AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
            details.setId("hh");
            details.setClientId("JEU4OITC5S57K0NBELRP4TA5TAM49Q2H4BM1P09AO46G6B12R6N5431F98L2TT6S");
            details.setClientSecret("T8NQB9CUPR7BON1D34RNHNOR3UIT243B248484668GV0DMLIFLKF6F4V6DO5VC6P");
            details.setAccessTokenUri("https://m.hh.ru/oauth/token");
            details.setUserAuthorizationUri("https://m.hh.ru/oauth/authorize");
            details.setTokenName("access_token");
            details.setAuthenticationScheme(AuthenticationScheme.form);
            return details;
        }

        @Bean
        public OAuth2RestTemplate hhRestTemplate(OAuth2ClientContext clientContext) {
            return new OAuth2RestTemplate(hh(), clientContext);
        }
    }
}
