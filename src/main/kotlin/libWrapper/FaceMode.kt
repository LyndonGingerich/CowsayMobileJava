package libWrapper

import com.github.ricksbrown.cowsay.plugin.CowExecutor

enum class FaceMode {
    None,
    Borg,
    Dead,
    Greedy,
    Paranoid,
    Stoned,
    Tired,
    Worried,
    Youthful,
}

fun CowExecutor.setFaceModeEnum(faceMode : FaceMode) {
    this.setMode(
        when (faceMode) {
            FaceMode.None -> null
            FaceMode.Borg -> "b"
            FaceMode.Dead -> "d"
            FaceMode.Greedy -> "g"
            FaceMode.Paranoid -> "p"
            FaceMode.Stoned -> "s"
            FaceMode.Tired -> "t"
            FaceMode.Worried -> "w"
            FaceMode.Youthful -> "y"
        }
    )
}
