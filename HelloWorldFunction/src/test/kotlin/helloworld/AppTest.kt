package helloworld

import org.junit.Assert
import org.junit.Test

internal class AppTest {

    private val testApp: App = App()

    @Test
    fun testHandler() {
        val res = testApp.handleRequest(null,null)
        Assert.assertEquals(res, "Success")
    }
}