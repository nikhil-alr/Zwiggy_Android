package com.example.zwiggy.utills

import java.io.InputStream

class FileReader {

    fun getFileContent()
    {

    }

    fun readJSONFromAsset(): String? {
        var json: String? = null
        try {
            val  inputStream: InputStream = assets.open("yourFile.json")
            json = inputStream.bufferedReader().use{it.readText()}
        } catch (ex: Exception) {
            ex.printStackTrace()
            return null
        }
        return json
    }
}