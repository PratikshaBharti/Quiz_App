package pratiksha.myquizapp

object Constants{

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1, "What country does this flag belong to?" ,
            R.drawable.france_flag,
            "France" , "Australia" ,
            "Afghanistan" , "China" ,
            1
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2, "What country does this flag belong to?" ,
            R.drawable.german_fg,
            "Pakistan" , "Australia" ,
            "Afghanistan" , "Germany" ,
            4
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3, "What country does this flag belong to?" ,
            R.drawable.indian_fg,
            "India" , "Australia" ,
            "Afghanistan" , "China" ,
            1
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4, "What country does this flag belong to?" ,
            R.drawable.israel_fg,
            "Pakistan" , "Israel" ,
            "   Bangladesh" , "China" ,
            2
        )
        questionList.add(que4)

        //5
        val que5 = Question(
            5, "What country does this flag belong to?" ,
            R.drawable.lithuania_fg,
            "Pakistan" , "Australia" ,
            "Lithuania" , "China" ,
            3
        )
        questionList.add(que5)

        //6
        val que6 = Question(
            6, "What country does this flag belong to?" ,
            R.drawable.netherland_fg,
            "Neitherland" , "Australia" ,
            "   Bangladesh" , "China" ,
            1
        )
        questionList.add(que6)

        //7
        val que7 = Question(
            7, "What country does this flag belong to?" ,
            R.drawable.russia_fg,
            "Pakistan" , "Australia" ,
            "   Bangladesh" , "Russia" ,
            4
        )
        questionList.add(que7)

        //8
        val que8 = Question(
            8, "What country does this flag belong to?" ,
            R.drawable.spain_fg,
            "Pakistan" , "Spain" ,
            "   Bangladesh" , "China" ,
            2
        )
        questionList.add(que8)

        //9
        val que9 = Question(
            9, "What country does this flag belong to?" ,
            R.drawable.canada_fg,
            "Pakistan" , "Australia" ,
            "Canada" , "China" ,
            3
        )
        questionList.add(que9)

        //10
        val que10 = Question(
            10, "What country does this flag belong to?" ,
            R.drawable.taiwan_fg,
            "Taiwan" , "Australia" ,
            "   Bangladesh" , "China" ,
            1
        )
        questionList.add(que10)

        return questionList
    }

}