package com.example.gmail

import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import android.graphics.Typeface.NORMAL
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.R.layout.email_item


class EmailAdapter(val emails: MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun getItemCount(): Int = emails.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(email: Email) {

            with(email){
                itemView.findViewById<TextView>(R.id.txt_icon).text = user.first().toString()
                itemView.findViewById<TextView>(R.id.txt_user).text = user
                itemView.findViewById<TextView>(R.id.txt_subject).text = subject
                itemView.findViewById<TextView>(R.id.txt_preview).text = preview
                itemView.findViewById<TextView>(R.id.txt_date).text = date

                itemView.findViewById<TextView>(R.id.txt_user).setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)
                itemView.findViewById<TextView>(R.id.txt_subject).setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)
                itemView.findViewById<TextView>(R.id.txt_date).setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)

                itemView.findViewById<ImageView>(R.id.img_star).setImageResource(
                    if(stared) R.drawable.baseline_star_24
                    else R.drawable.baseline_star_outline_24
                )
            }

        }

    }
}

