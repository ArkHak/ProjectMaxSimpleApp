import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import ru.mysin_o.project_max_simple_app.SayHelloFromCommon
import ru.mysin_o.project_max_simple_app.sayHello

fun main() {
    sayHello()

    application {

        val state = rememberWindowState().apply { size = DpSize(200.dp, 200.dp) }

        Window(
            onCloseRequest = { exitApplication() },
            state = state,
            title = "ProjectMaxSimpleApp"
        ) {
            SayHelloFromCommon()
        }
    }
}