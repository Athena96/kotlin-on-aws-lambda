package helloworld

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class App : RequestHandler<Unit, String> {
    override fun handleRequest(event: Unit?, context: Context?): String {
        println("Hello, Kotlin!")
        return "Success"
    }
}