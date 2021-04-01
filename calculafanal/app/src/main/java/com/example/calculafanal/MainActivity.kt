package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculafanal.R

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var first: Double = 0.00
    var math: Int = 0
    var put: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        one.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("1")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("1")
            } else {
                var str = rst.text.toString().plus(1)
                rst.setText(str)
            }

        }


        two.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("2")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("2")
            } else {
                var str = rst.text.toString().plus(2)
                rst.setText(str)
            }
        }
        three.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("3")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("3")
            } else {
                var str = rst.text.toString().plus(3)
                rst.setText(str)
            }
        }
        four.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("4")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("4")
            } else {
                var str = rst.text.toString().plus(4)
                rst.setText(str)
            }
        }
        five.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("5")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("5")
            } else {
                var str = rst.text.toString().plus(5)
                rst.setText(str)
            }
        }
        six.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("6")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("6")
            } else {
                var str = rst.text.toString().plus(6)
                rst.setText(str)
            }
        }
        seven.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("7")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("7")
            } else {
                var str = rst.text.toString().plus(7)
                rst.setText(str)
            }
        }
        eight.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("8")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("8")
            } else {
                var str = rst.text.toString().plus(8)
                rst.setText(str)
            }
        }
        nine.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("9")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("9")
            } else {
                var str = rst.text.toString().plus(9)
                rst.setText(str)
            }
        }
        zero.setOnClickListener {
            if (rst.text.toString() == "0" && put == 0) {
                rst.setText("0")
            } else if (put == 1) {
                rst.setText("")
                put = 0
                rst.setText("0")
            } else {
                var str = rst.text.toString().plus(0)
                rst.setText(str)
            }
        }
        cancel.setOnClickListener {
            rst.setText("0")
            first = 0.00
            math = 0
            put = 0
        }

        del.setOnClickListener {
            if (rst.text.toString().length <= 1) {
                rst.setText("0")
            } else if (rst.text.isNotEmpty()) {
                rst.text = rst.text.dropLast(1)
            }
        }

        plus.setOnClickListener {
            if (rst.text.toString() > "0") {
                var str = rst.text.toString().toDouble()
                first = first + str
                math = 1
                put = 1
            }
        }

        minus.setOnClickListener {
            if (rst.text.toString() > "0") {
                var str = rst.text.toString().toDouble()
                first = first + str
                math = 2
                put = 1
            }
        }

        time.setOnClickListener {
            if (rst.text.toString() > "0") {
                var str = rst.text.toString().toDouble()
                first = first + str
                math = 3
                put = 1
            }
        }

        div.setOnClickListener {
            if (rst.text.toString() > "0") {
                var str = rst.text.toString().toDouble()
                first = first + str
                math = 4
                put = 1
            }
        }

        mod.setOnClickListener {
            if (rst.text.toString() > "0") {
                var str = rst.text.toString().toDouble()
                first = first + str
                math = 5
                put = 1
            }
        }

        eq.setOnClickListener {
            if (rst.text.toString() > "0") {

            }
            if (math == 1) {
                var str = rst.text.toString().toDouble()
                first = first + str
                rst.setText("$first")
            } else if (math == 2) {
                var str = rst.text.toString().toDouble()
                first = first - str
                rst.setText("$first")
            } else if (math == 3) {
                var str = rst.text.toString().toDouble()
                first = first * str
                rst.setText("$first")
            } else if (math == 4) {
                var str = rst.text.toString().toDouble()
                if (str == 0.00) {
                    rst.setText("Error")
                } else {
                    first = first / str
                    rst.setText("$first")
                }
            } else if (math == 5) {
                var str = rst.text.toString().toDouble()
                if (str == 0.00) {
                    rst.setText("Error")
                } else {
                    first = first % str
                    rst.setText("$first")
                }
            }
        }
    }
}


