package com.peterford.notetakerpeterford.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.peterford.notetakerpeterford.R;
import com.peterford.notetakerpeterford.model.Note;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteViewHolder>{

    private List<Note> mNote_l;
    private Context mContext;

    public NoteListAdapter(Context context, List<Note> note_l) {
        mContext = context;
        mNote_l = note_l;
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("NOTELISTADAPTER", "INSIDE ONCREATEVIEWHOLDER");
        View view = LayoutInflater.from(mContext).inflate(R.layout.main_note_list_item, parent, false);
        NoteViewHolder holder = new NoteViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        holder.bindData( mNote_l.get(position) );
    }

    @Override
    public int getItemCount() {
        return mNote_l.size();
    }

    protected class NoteViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.note_title_list_item) TextView mNoteTitle;
        @BindView(R.id.note_content_list_item) TextView mNoteContent;

        public NoteViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindData(Note note) {
            Log.i("NOTEVIEWHOLDER", "inside bindData");
            mNoteTitle.setText( "THIS IS A TITLE" );
            mNoteContent.setText( "THIS IS A CONTENT" );
        }

    }


}
