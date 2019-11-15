package ru.job4j.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Class SpringConfig configures instead XML.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 13.11.2019.
 */
@Configuration
@ComponentScan("ru.job4j.annotationconfig")
public class SpringConfig {
}
