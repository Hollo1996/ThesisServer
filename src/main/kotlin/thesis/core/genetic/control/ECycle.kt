package thesis.core.genetic.control

import thesis.core.genetic.GeneticAlgorithm

enum class ECycle {
    EXAMPLE {
        override fun invoke(alg: GeneticAlgorithm) {
            TODO("Not yet implemented")
        }
    };

    abstract operator fun invoke(alg: GeneticAlgorithm)
}