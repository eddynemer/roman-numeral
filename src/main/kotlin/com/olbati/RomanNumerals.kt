package com.olbati

class RomanNumerals {

    private val config = HashMap<Int, String>()
    private val reverseConfig = HashMap<String, Int>()

    init {
        config[1000] = "M"
        config[900] = "DM"
        config[500] = "D"
        config[400] = "CD"
        config[100] = "C"
        config[90] = "XC"
        config[50] = "L"
        config[40] = "XL"
        config[10] = "X"
        config[9] = "IX"
        config[5] = "V"
        config[4] = "IV"
        config[1] = "I"

        reverseConfig["M"] = 1000
        reverseConfig["D"] = 500
        reverseConfig["C"] = 100
        reverseConfig["L"] = 50
        reverseConfig["X"] = 10
        reverseConfig["V"] = 5
        reverseConfig["I"] = 1
    }

    fun reverseConvert(input: String, output: Int = 0, previousInput: String = ""): Int {
        var tempOutput = output
        if (input.isEmpty()) {
            return tempOutput
        }

        val letter = input.toCharArray().last().toString()
        reverseConfig.containsKey(letter).let {
            if (previousInput.isNotBlank()) {
                reverseConfig.containsKey(previousInput).let {
                    if (reverseConfig[previousInput]!! > reverseConfig[letter]!!) {
                        tempOutput -= reverseConfig[letter]!!
                        return reverseConvert(input.dropLast(1), tempOutput, letter)
                    }
                }
            }
            tempOutput += reverseConfig[letter]!!
            return reverseConvert(input.dropLast(1), tempOutput, letter)
        }
    }

    fun convert(i: Int, outputBuilder: StringBuilder = StringBuilder()): String {
        var input = i

        /*//0
        if (config.containsKey(input + 1)) {
            outputBuilder.append("I")
            outputBuilder.append(config[input + 1])
            input = -1
            convert(input, outputBuilder)
        }

        //0
        if (config.containsKey(input + 10)) {
            outputBuilder.append("X")
            outputBuilder.append(config[input + 10])
            input = -1
            convert(input, outputBuilder)
        }

        //0
        if (config.containsKey(input + 100)) {
            outputBuilder.append("C")
            outputBuilder.append(config[input + 100])
            input = -1
            convert(input, outputBuilder)
        }*/

        //1
        if (config.containsKey(input)) {
            outputBuilder.append(config[input])
            input = -1
            convert(input, outputBuilder)
        }

        //2
        if (input <= 0) {
            return outputBuilder.toString()
        }

        //3
        for (currentKey in config.keys.sortedDescending()) {
            if (input % currentKey < input) {
                outputBuilder.append(config[currentKey])
                input -= currentKey
                convert(input, outputBuilder)
                break
            }
        }
        return outputBuilder.toString()
    }


    fun secondOldConvert(i: Int): String {
        var input = i
        if (config.containsKey(input)) return config[input]!!

        val outputBuilder = StringBuilder()
        var previousKey = config.keys.max()

        while (input != 0) {
            for (currentKey in config.keys.sortedDescending()) {
                while (currentKey <= input) {
                    for (smallerKey in config.keys.sorted()) {
                        if (input + smallerKey == previousKey) {
                            outputBuilder.append(config[smallerKey])
                            outputBuilder.append(config[previousKey])
                            input -= currentKey
                            return outputBuilder.toString()
                        }
                    }
                    outputBuilder.append(config[currentKey])
                    input -= currentKey
                    break
                }
                previousKey = currentKey
            }
        }
        return outputBuilder.toString()
    }


    //1- Turn roman numerals to config
    fun convertOld(input: Int): String {
        if (input == 1) return "I"
        if (input == 5) return "V"
        if (input == 10) return "X"
        if (input == 50) return "L"
        if (input == 100) return "C"
        if (input == 500) return "D"
        if (input == 1000) return "M"
        return ""
    }

}
