package com.rodtech.serverless

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.rodtech.serverless.response.ApiGatewayResponse
import org.apache.log4j.Logger

class ApiHandle : RequestHandler<Map<String, *>, ApiGatewayResponse>{

    companion object {
        private val log = Logger.getLogger(ApiHandle::class.java)
    }

    override fun handleRequest(input: Map<String, *>?, context: Context?): ApiGatewayResponse {
        log.info("received: $input")
        return ApiGatewayResponse(
            statusCode = 200,
            body = "Go Serverless v1.x! Your function executed successfully!",
            headers = mapOf(Pair("X-Powered-By", "AWS Lambda & serverless"))
        )
    }

}