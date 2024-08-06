package GradleMapInPlace;

import org.gradle.api.Transformer;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;
import org.gradle.api.specs.Spec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class PropertyMapInPlace<T> implements Property<T> {

    private Function<T, T> map;
    private T value;

    public void mapInPlace(Function<T, T> map) {
        this.map = map;
    }

    @Override
    public void set(@Nullable T value) {
        this.value = value;
    }

    @Override
    public void set(@NotNull Provider<? extends T> provider) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Property<T> value(@Nullable T value) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Property<T> value(@NotNull Provider<? extends T> provider) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Property<T> unset() {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Property<T> convention(@Nullable T value) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Property<T> convention(@NotNull Provider<? extends T> provider) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Property<T> unsetConvention() {
        throw new RuntimeException("to implement");
    }

    @Override
    public void finalizeValue() {
        throw new RuntimeException("to implement");
    }

    @Override
    public void finalizeValueOnRead() {
        throw new RuntimeException("to implement");
    }

    @Override
    public void disallowChanges() {
        throw new RuntimeException("to implement");
    }

    @Override
    public void disallowUnsafeRead() {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull T get() {
        throw new RuntimeException("to implement");
    }

    public @NotNull T getCurrentValue() {
        return value;
    }

    public @NotNull T getFinalValue() {
        return map.apply(value);
    }

    @Override
    public @Nullable T getOrNull() {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull T getOrElse(@NotNull T defaultValue) {
        throw new RuntimeException("to implement");
    }

    @Override
    public <S> @NotNull Provider<S> map(@NotNull Transformer<? extends S, ? super T> transformer) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Provider<T> filter(@NotNull Spec<? super T> spec) {
        throw new RuntimeException("to implement");
    }

    @Override
    public <S> @NotNull Provider<S> flatMap(@NotNull Transformer<? extends @Nullable Provider<? extends S>, ? super T> transformer) {
        throw new RuntimeException("to implement");
    }

    @Override
    public boolean isPresent() {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Provider<T> orElse(@NotNull T value) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Provider<T> orElse(@NotNull Provider<? extends T> provider) {
        throw new RuntimeException("to implement");
    }

    @Override
    public @NotNull Provider<T> forUseAtConfigurationTime() {
        throw new RuntimeException("to implement");
    }

    @Override
    public <U, R> @NotNull Provider<R> zip(@NotNull Provider<U> right, @NotNull BiFunction<? super T, ? super U, ? extends R> combiner) {
        throw new RuntimeException("to implement");
    }
}
