package com.example.memo.service

import com.example.memo.repository.MemoRepository
import com.example.memo.domain.Memo
import org.springframework.stereotype.Service

@Service
class MemoService (private val memoRepository: MemoRepository) {
    fun findAll() = memoRepository.findAll()

    fun findOne(id: Long) = memoRepository.findById(id).orElse(null)

    fun save(memo: Memo) = memoRepository.save(memo)

    fun delete(id: Long) = memoRepository.deleteById(id)
}