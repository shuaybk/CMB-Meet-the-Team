package com.example.cmbmeettheteam.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cmbmeettheteam.Models.TeamMember;
import com.example.cmbmeettheteam.R;

import java.util.ArrayList;

public class TeamRecyclerViewAdapter extends RecyclerView.Adapter<TeamRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "TeamRecyclerViewAdapter";
    private ArrayList<TeamMember> teamMembers;

    public TeamRecyclerViewAdapter(ArrayList<TeamMember> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_member_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TeamMember teamMember = teamMembers.get(position);

        holder.teamMemberName.setText(teamMember.getName());
    }

    @Override
    public int getItemCount() {
        return teamMembers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView teamMemberName;

        public ViewHolder(View itemView) {
            super(itemView);
            teamMemberName = itemView.findViewById(R.id.member_name_text);
        }
    }
}
