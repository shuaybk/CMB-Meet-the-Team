package com.example.cmbmeettheteam.UI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cmbmeettheteam.Models.TeamMember;
import com.example.cmbmeettheteam.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TeamRecyclerViewAdapter extends RecyclerView.Adapter<TeamRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "TeamRecyclerViewAdapter";
    private ArrayList<TeamMember> teamMembers;
    private int imageWidth;

    public TeamRecyclerViewAdapter(ArrayList<TeamMember> teamMembers, int imageWidth) {
        this.teamMembers = teamMembers;
        this.imageWidth = imageWidth;
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

        holder.teamMemberPic.setLayoutParams(new ConstraintLayout.LayoutParams(imageWidth, imageWidth));
        Picasso.get().load(teamMember.getImageLink())
                .placeholder(R.drawable.user_pic_placeholder)
                .into(holder.teamMemberPic);
        holder.teamMemberName.setText(teamMember.getName());
        holder.teamMemberPosition.setText(teamMember.getPosition());
        System.out.println(teamMember.getImageLink());
    }

    @Override
    public int getItemCount() {
        return teamMembers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView teamMemberName;
        TextView teamMemberPosition;
        ImageView teamMemberPic;

        public ViewHolder(View itemView) {
            super(itemView);
            teamMemberName = itemView.findViewById(R.id.member_name_text);
            teamMemberPosition = itemView.findViewById(R.id.member_position_text);
            teamMemberPic = itemView.findViewById(R.id.member_image);
        }
    }
}
