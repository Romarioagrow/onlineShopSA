package app;

/*@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "app")*/
public class MainDispatcherServlet /*implements WebApplicationInitializer*/ {

    /*@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();

        context.setConfigLocation("app.config");
        context.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic dispatcher = servletContext
                .addServlet("dispatcher", new DispatcherServlet(context));

        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }*/
}

