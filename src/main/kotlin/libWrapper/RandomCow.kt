package libWrapper

import com.github.ricksbrown.cowsay.plugin.CowExecutor
import kotlin.random.Random

fun getRandomCow(message : String) : String {
    val executor = CowExecutor()
    val random = Random.Default

    executor.setThink(random.nextBoolean())
    executor.setMessage(message)
    executor.setFaceModeEnum(FaceMode.entries.random())
    executor.setCowfile(cowFiles.random())

    return executor.execute()
}
