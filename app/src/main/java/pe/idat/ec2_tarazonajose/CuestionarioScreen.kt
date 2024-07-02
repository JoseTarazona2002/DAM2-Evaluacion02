package pe.idat.ec2_tarazonajose

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun cuestionarioScreen(){
    Column(
        Modifier
            .background(Color.White)
            .padding(24.dp)
            .fillMaxWidth()) {
        tituloDialog(titulo = "CUESTIONARIO:")
        tituloDialog(titulo = "1. Marque sus platos Favoritos:")
        itemOption(opcion = "Arroz con Pollo",
            drawable = R.drawable.ic_launcher_foreground)
        itemOption(opcion = "Lomo Saltado",
            drawable = R.drawable.ic_launcher_background)
        itemOption(opcion = "Aji de Gallina",
            drawable = R.drawable.ic_launcher_foreground)
        itemOption(opcion = "Tallarines",
            drawable = R.drawable.ic_launcher_foreground)
        itemOption(opcion = "Arroz Chaufa",
            drawable = R.drawable.ic_launcher_foreground)
    }
}

/*@Composable
fun EjemploDialogAdvanced(
    mostrar: Boolean,
    onDismiss: () -> Unit
) {
    if (mostrar) {
        Dialog(onDismissRequest = { onDismiss() }) {

        }
    }
}*/

@Composable
fun itemOption(opcion: String, @DrawableRes drawable: Int) {
    TextButton(onClick = { /*TODO*/ }) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = "img",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Text(
                text = opcion, fontSize = 14.sp,
                color = Color.Gray, modifier = Modifier.padding(8.dp)
            )
        }
    }

}

@Composable
fun tituloDialog(
    titulo: String,
    modifier: Modifier = Modifier.padding(bottom = 12.dp)
) {
    Text(
        text = titulo,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        modifier = modifier
    )
}