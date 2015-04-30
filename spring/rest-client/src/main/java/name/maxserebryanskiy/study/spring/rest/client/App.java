package name.maxserebryanskiy.study.spring.rest.client;

import name.maxserebryanskiy.study.spring.rest.client.domain.Page;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
        System.out.println("Name:                     " + page.getName());
        System.out.println("About:                    " + page.getAbout());
        System.out.println("Phone:                    " + page.getPhone());
        System.out.println("Website:                  " + page.getWebsite());
        System.out.println("Is community page:        " + page.isCommunityPage());
        System.out.println("City:                     " + page.getCity());
    }
}
