import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import de.codecentric.mule.configuration.MuleContextInitializer;

/**
 * Created by Justin.Bell on 6/24/2015.
 */
@SpringBootApplication
public class Application
{

    public static void main(String[] args)
    {
        SpringApplication.run(MuleContextInitializer.class, args);
    }

    @Bean
    @ConditionalOnMissingBean
    @ConfigurationProperties(prefix="mule")
    protected MuleContextInitializer muleContextInitializer() {
        return new MuleContextInitializer();
    }

}
