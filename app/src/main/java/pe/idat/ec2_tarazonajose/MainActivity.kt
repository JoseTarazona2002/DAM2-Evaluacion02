package pe.idat.ec2_tarazonajose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.idat.ec2_tarazonajose.ui.theme.EC2TarazonaJoseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC2TarazonaJoseTheme {

                Box(modifier = Modifier.fillMaxSize().padding(top = 35.dp,
                    start = 15.dp, end = 15.dp, bottom = 35.dp)){
                    cuestionarioScreen()
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EC2TarazonaJoseTheme {

    }
}