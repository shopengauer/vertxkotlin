package com.pdf.textparser.platform

import io.vertx.core.AbstractVerticle
import io.vertx.core.Future


class RestVerticle : AbstractVerticle(){

    override fun start(startFuture: Future<Void>?) {
        super.start(startFuture)

        var server = vertx.createHttpServer()

        server.requestHandler({ request ->

            // This handler gets called for each request that arrives on the server
            var response = request.response()
            response.putHeader("content-type", "text/plain")

            // Write to the response and end it
            response.end("This is my startUp PdfWords!")
        })

        server.listen(8081)
    }
}


