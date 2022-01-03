package com.wwang.mybackendkickstarter.presentation.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.springframework.http.MediaType
import org.springframework.util.MimeType
import org.springframework.web.servlet.function.router
import java.io.IOException

@Configuration
class StaticRouter(
    private val env: Environment,
    @Value("classpath:/static/main.html") private val html: Resource,
    val resourceLoader: ResourceLoader
) {
    @Bean
    fun resourcesRouter() = router {
        GET("/") {
            val served = String(html.inputStream.readAllBytes())
            ok().contentType(MediaType.TEXT_HTML).body(served)
        }
        (GET("/*.js") or GET("/*.js.gz")) {
            try {
                val relativePath = if (it.path().startsWith('/')) it.path().drop(1) else it.path()
                val staticResource = resourceLoader.getResource("classpath:/static/$relativePath")
                if (staticResource.exists()) {
                    ok().contentType(
                        MediaType.asMediaType(MimeType.valueOf("application/javascript"))
                    ).body(staticResource.inputStream.readAllBytes())
                } else {
                    notFound().build()
                }
            } catch (e: IOException) {

                notFound().build()
            }
        }
    }
}