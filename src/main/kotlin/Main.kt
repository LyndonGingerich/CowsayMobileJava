import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import libWrapper.RandomCow

@Composable
@Preview
fun App() {
    val clipboardText = LocalClipboardManager.current.getText()?.text ?: "Can't find it."
    var displayText by remember { mutableStateOf(clipboardText) }

    MaterialTheme {
        Button(onClick = {
            displayText = RandomCow.getAny(clipboardText)
        }) {
            Text(displayText, fontFamily = FontFamily.Monospace)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
