package com.example.memo.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

//DB
@Entity
data class Memo(
        @Id //主キー
        @GeneratedValue //自動で連番
        val id:     Long? = null,
        var date:   String? = null,
        val title:  String? = null,
        val name:   String? = null,
        val address:String? = null,
        val note:   String? = null
)