package libWrapper

import com.github.ricksbrown.cowsay.plugin.CowExecutor
import kotlin.random.Random

class RandomCow {
    companion object {
        private fun getBasic(message : String, setRandomElement : ((CowExecutor) -> Unit)) : String {
            val executor = CowExecutor()
            val random = Random.Default

            executor.setThink(random.nextBoolean())
            executor.setMessage(message)
            setRandomElement(executor)

            return executor.execute()
        }

        fun getByFace(message : String) : String =
            getBasic(message) { it.setFaceModeEnum(FaceMode.entries.random()) }

        fun getByFile(message : String) : String =
            getBasic(message) { it.setCowfile(cowFiles.random()) }

        fun getAny(message : String) =
            if (Random.nextBoolean()) getByFace(message) else getByFile(message)
    }
}
