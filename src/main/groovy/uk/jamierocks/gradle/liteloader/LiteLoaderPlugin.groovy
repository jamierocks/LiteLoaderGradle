/*
 * This file is part of LiteLoaderGradle, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015, Jamie Mansfield <https://github.com/jamierocks>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package uk.jamierocks.gradle.liteloader

import net.minecraftforge.gradle.GradleConfigurationException
import net.minecraftforge.gradle.delayed.DelayedFile
import net.minecraftforge.gradle.tasks.ProcessJarTask
import net.minecraftforge.gradle.user.UserBasePlugin
import net.minecraftforge.gradle.user.UserExtension

class LiteLoaderPlugin<T extends UserExtension> extends UserBasePlugin<T> {

    @Override
    String getApiName() {
        "LiteLoader"
    }

    @Override
    protected String getSrcDepName() {
        "liteloader_${project.name}_src"
    }

    @Override
    protected String getBinDepName() {
        "liteloader_${project.name}_bin"
    }

    @Override
    protected boolean hasApiVersion() {
        return false
    }

    @Override
    protected String getApiVersion(T t) {
        return null
    }

    @Override
    protected String getMcVersion(T t) {
        return null
    }

    @Override
    protected String getApiCacheDir(T t) {
        return null
    }

    @Override
    protected String getSrgCacheDir(T t) {
        return null
    }

    @Override
    protected String getUserDevCacheDir(T t) {
        return null
    }

    @Override
    protected String getUserDev() {
        return null
    }

    @Override
    protected String getClientTweaker() {
        "com.mumfrey.liteloader.launch.LiteLoaderTweaker"
    }

    @Override
    protected String getServerTweaker() {
        "" // server support = false
    }

    @Override
    protected String getStartDir() {
        return null
    }

    @Override
    protected String getClientRunClass() {
        "com.mumfrey.liteloader.debug.Start"
    }

    @Override
    protected Iterable<String> getClientRunArgs() {
        return null
    }

    @Override
    protected String getServerRunClass() {
        "net.minecraft.server.MinecraftServer"
    }

    @Override
    protected Iterable<String> getServerRunArgs() {
        return null
    }

    @Override
    protected void configureDeobfuscation(ProcessJarTask processJarTask) {

    }

    @Override
    protected void doVersionChecks(String s) {
        if (version != '1.8')
            throw new GradleConfigurationException('Only Minecraft 1.8 is supported currently')
    }

    @Override
    void applyOverlayPlugin() {

    }

    @Override
    boolean canOverlayPlugin() {
        return false
    }

    @Override
    protected DelayedFile getDevJson() {
        return null
    }

    @Override
    protected T getOverlayExtension() {
        return null
    }
}
