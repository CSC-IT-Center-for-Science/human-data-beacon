package org.ega_archive.elixirbeacon.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Order(1)
@EnableOAuth2Sso
@Configuration
public class OAuthSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.antMatcher("/**").authorizeRequests()
      .antMatchers("/beacon/protected/**").authenticated()
      .antMatchers("/", "/login**", "/beacon/**").permitAll()
//      .and().logout().logoutSuccessUrl("/beacon/").permitAll()
    ;
  }

}