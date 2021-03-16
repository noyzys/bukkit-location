/**
 * @author: noyzys on 18:36, 16.03.2021
 **/
sealed interface ImmutableLookable<N> {
    val yaw: N
    val pitch: N
}

data class ImmutableDataLookable<N>(
    override val yaw: N,
    override val pitch: N
) : ImmutableLookable<N>

interface ImmutableLookableable<LOOKABLE : ImmutableLookable<*>> {
    val lookable: LOOKABLE
}
