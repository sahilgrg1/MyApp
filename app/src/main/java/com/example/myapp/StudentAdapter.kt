package com.example.myapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_row.view.*

class StudentAdapter(students :ArrayList<Student> ,ctx:Context): BaseAdapter()
{
    private val students:ArrayList<Student> = students
    private val ctx:Context = ctx


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       val current = students.get(position)
        val li  = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val inflatedView = li.inflate(R.layout.item_row,parent , false)
        inflatedView.name.text = current.name
        inflatedView.hello.text = current.place
        return inflatedView


    }

    override fun getItem(position: Int): Student {
        return students.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {

    return  students.size
    }

}