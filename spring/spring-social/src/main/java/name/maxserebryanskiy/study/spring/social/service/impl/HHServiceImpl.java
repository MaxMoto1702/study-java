package name.maxserebryanskiy.study.spring.social.service.impl;

import name.maxserebryanskiy.study.spring.social.model.HHUser;
import name.maxserebryanskiy.study.spring.social.service.HHService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestOperations;

/**
 * Created by maksim.serebryanskiy on 28.04.2015.
 */
public class HHServiceImpl implements HHService {

    private static final Logger LOG = LoggerFactory.getLogger(HHServiceImpl.class);
    private RestOperations hhRestTemplate;

    public RestOperations getHhRestTemplate() {
        return hhRestTemplate;
    }

    public void setHhRestTemplate(RestOperations hhRestTemplate) {
        this.hhRestTemplate = hhRestTemplate;
    }

    @Override
    public HHUser getUser() {
        return hhRestTemplate.getForObject("/me", HHUser.class);
    }
}
