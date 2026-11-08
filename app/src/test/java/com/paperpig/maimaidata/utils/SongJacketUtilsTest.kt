package com.paperpig.maimaidata.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class SongJacketUtilsTest {

    private val assetPrefix = "file:///android_asset/Music/"

    @Test
    fun standardSongIdUsesSixDigitJacket() {
        assertEquals("${assetPrefix}ui_jacket_000008.webp", SongJacketUtils.jacketAssetUrl(8))
    }

    @Test
    fun dxSongIdMapsToStandardNumber() {
        assertEquals("${assetPrefix}ui_jacket_000008.webp", SongJacketUtils.jacketAssetUrl(10008))
    }

    @Test
    fun utageSongIdsMapToStandardNumber() {
        assertEquals("${assetPrefix}ui_jacket_000018.webp", SongJacketUtils.jacketAssetUrl(100018))
        assertEquals("${assetPrefix}ui_jacket_000001.webp", SongJacketUtils.jacketAssetUrl(100001))
    }

    @Test
    fun fourDigitSongIdIsPaddedToSixDigits() {
        assertEquals("ui_jacket_002093.webp", SongJacketUtils.jacketFileName(2093))
    }
}
