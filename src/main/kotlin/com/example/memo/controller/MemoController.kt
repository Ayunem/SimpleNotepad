package com.example.memo.controller

import com.example.memo.domain.Memo
import com.example.memo.service.MemoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.text.SimpleDateFormat
import java.util.*

@Controller
@RequestMapping("/main")
class MemoController (private val memoService: MemoService) {
    @GetMapping
    fun index(model: Model): String {

        model.addAttribute("main", memoService.findAll())
        return "main/index"
    }

    @GetMapping("new")
    fun newMemo(): String {
        return "main/new"
    }

    @GetMapping("{id}/edit")
    fun edit(@PathVariable id: Long, model: Model): String {
        model.addAttribute("player", memoService.findOne(id))
        return "main/edit"
    }

    @GetMapping("{id}")
    fun show(@PathVariable id: Long, model: Model): String {
        model.addAttribute("player", memoService.findOne(id))
        return "main/show"
    }

    @PostMapping
    fun create(@ModelAttribute memo: Memo): String {
        val now = Calendar.getInstance()
        val baseDate = now.time
        val sdf = SimpleDateFormat("yyyy/MM/dd")

        memo.date = sdf.format(baseDate)
        memoService.save(memo)
        return "redirect:/main"
    }

    @GetMapping("upd/{id}")
    fun update(@PathVariable id: Long, @ModelAttribute memo: Memo): String {
        memoService.save(memo.copy(id = id))
        return "redirect:/main"
    }

    @GetMapping("del/{id}")
    fun destroy(@PathVariable id: Long): String {
        memoService.delete(id)
        return "redirect:/main"
    }
}