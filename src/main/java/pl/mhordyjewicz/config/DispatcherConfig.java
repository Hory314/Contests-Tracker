package pl.mhordyjewicz.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import pl.mhordyjewicz.filter.AdminSessionFilter;

import javax.servlet.Filter;

public class DispatcherConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[]{JPAConfig.class, WebSecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[]{WebConfig.class};
    }


    @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters()
    {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        AdminSessionFilter adminSessionFilter = new AdminSessionFilter();
        return new Filter[]{encodingFilter/*, adminSessionFilter*/};
    }
}
