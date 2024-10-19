package com.example.smeb9716.foundation

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.view.ViewGroup
import com.example.smeb9716.R
import com.example.smeb9716.databinding.DialogBinding

@SuppressLint("UseCompatLoadingForDrawables")
class BaseDialog(
    context: Context,
    private val titleDialog: String? = null,
    private val contentDialog: String? = null,
    private val titleBtnLeft: String? = null,
    private val titleBtnRight: String? = null,
    private val onConfirm: (() -> Unit)? = null
) : Dialog(context) {

    private val dialogBinding: DialogBinding = DialogBinding.inflate(layoutInflater)

    init {
        // Set attributes for Dialog
        window?.apply {
            setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            setBackgroundDrawable(context.getDrawable(R.drawable.custom_dialog_background))
        }
        setCancelable(false)
        setCanceledOnTouchOutside(false)

        // Set view for Dialog
        setContentView(dialogBinding.root)

        initViews()
        initEvents()
    }

    private fun initViews() {
        titleDialog?.takeIf { it.isNotEmpty() }?.let {
            dialogBinding.titleDialog.text = it
        }

        contentDialog?.takeIf { it.isNotEmpty() }?.let {
            dialogBinding.contentDialog.text = it
        }

        titleBtnLeft?.takeIf { it.isNotEmpty() }?.let {
            dialogBinding.btnCancel.text = it
        }

        titleBtnRight?.takeIf { it.isNotEmpty() }?.let {
            dialogBinding.btnConfirm.text = it
        }
    }

    private fun initEvents() {
        dialogBinding.btnCancel.setOnClickListener { dismiss() }

        dialogBinding.btnConfirm.setOnClickListener {
            onConfirm?.invoke()
        }
    }
}