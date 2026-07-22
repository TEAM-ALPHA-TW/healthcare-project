@SpringBootApplication
public class MyApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MyApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
