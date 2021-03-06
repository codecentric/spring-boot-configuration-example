/*
 * Copyright 2016 codecentric AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.codecentric.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(Application.class);

        final TypeSafeConfiguration typeSafeConfiguration = ctx.getBean(TypeSafeConfiguration.class);
        final AnnotationConfiguration annotationConfiguration = ctx.getBean(AnnotationConfiguration.class);

        info("Application initialized with the following configuration:");
        info(typeSafeConfiguration.toString());
        info(annotationConfiguration.toString());
        System.out.println();
    }

    private static void info(String text) {
        System.out.println(String.format("Application.java: %s", text));
    }
}
