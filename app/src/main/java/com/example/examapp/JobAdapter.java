package com.example.examapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

////Answer to the question no 2. RecyclerView Adapter

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    String[] jobTitles = {
            "Intern Research Writer",
            "Intern - Human Resources (HR) Department",
            "Intern - Marketing Department",
            "Intern - Supply Chain Department",
            "Business Development Intern",
            "Customer Relation Officer",
            "Content creator (Videography/ Editing) Internship",
            "Edutech Intern (Student Apprenticeship Program)",
            "UI/UX Design Internship (Figma) - Khulna",
            "Corporate Sales Intern",
            "Accounts Intern",
            "Finance Intern",
            "Intern - Finance & Accounts Department",
            "Intern- Marketing/ Sales, Credit Management, Dhaka",
            "Intern - IT & Web Support",
            "Intern-Environment",
            "Intern Software Developer",
            "Intern - Testing Lab",
            "Digital Marketing & Graphics Design Intern",
            "Paid Intern- Female (EEE)",
            "Computer Trainee Intern",
            "Developer Intern",
            "Design Intern",
            "Internship",
            "Strategic Business Planning Intern",
            "Intern Sales & Customer Care Officer"
    };

    String[] companyNames = {
            "Exclusive School Of Innovation",
            "Kloud Project Limited",
            "Kloud Project Limited",
            "Kloud Project Limited",
            "WIT Institute",
            "Taiwan Machinery",
            "Locus",
            "Bay Institute of Renaissance Limited",
            "Host The Website",
            "Innovation Industries",
            "Bohu Bangladesh Limited",
            "Action Contre la Faim (ACF)",
            "Mohammadi Group",
            "ITS Labtest Bangladesh Ltd",
            "N2sys Technology",
            "Concern Worldwide",
            "Software Engineers Ltd.",
            "ITS Labtest Bangladesh Ltd",
            "Al Habib overseas",
            "Best Tex International Limited",
            "Babul Technical Institute",
            "Colissia Global Ltd.",
            "Colissia Global Ltd.",
            "ICB Islamic Bank Ltd.",
            "Shobchai Creative Solutions",
            "Wholesale Electronics City"
    };
    String[] jobLocations = {
            "Anywhere in Bangladesh",
            "Khulshi",
            "Gulshan",
            "Gulshan, Khulshi",
            "Dhaka",
            "DOHS Mirpur",
            "Dhaka",
            "Uttara West",
            "Khulna, Khulna Sadar",
            "Khilkhet",
            "Dhaka",
            "Dhaka",
            "Nikunja",
            "Dhaka",
            "DOHS Baridhara",
            "Dhaka",
            "Banasree",
            "Chattogram, Dhaka, Gazipur",
            "Banani",
            "Uttara Sector 11",
            "Kishoreganj",
            "Mirpur",
            "Mirpur",
            "Anywhere in Bangladesh",
            "GULSHAN 1",
            "Adabor"
    };
    String[] deadlines = {
            "30 Jun 2025",
            "30 Jun 2025",
            "30 Jun 2025",
            "30 Jun 2025",
            "29 Jun 2025",
            "18 Jul 2025",
            "30 Jun 2025",
            "18 Jul 2025",
            "28 Jun 2025",
            "3 Jul 2025",
            "21 Jun 2025",
            "25 Jun 2025",
            "30 Jun 2025",
            "2 Jul 2025",
            "30 Jun 2025",
            "17 Jul 2025",
            "30 Jun 2025",
            "1 Jul 2025",
            "30 Jun 2025",
            "16 Jul 2025",
            "30 Jun 2025",
            "25 Jun 2025",
            "25 Jun 2025",
            "28 Jun 2025",
            "29 Jun 2025",
            "26 Jun 2025"
    };

    @NonNull
    @Override
    public JobAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JobAdapter.ViewHolder holder, int position) {
        holder.tvJobTitle.setText(jobTitles[position]);
        holder.tvCompanyName.setText(companyNames[position]);
        holder.tvLocation.setText(jobLocations[position]);
        holder.tvDeadline.setText(deadlines[position]);
    }

    @Override
    public int getItemCount() {
        return jobTitles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvJobTitle,tvCompanyName,tvLocation,tvDeadline;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJobTitle = itemView.findViewById(R.id.tvJobTitle);
            tvCompanyName = itemView.findViewById(R.id.tvCompanyName);
            tvLocation = itemView.findViewById(R.id.tvLocation);
            tvDeadline = itemView.findViewById(R.id.tvDeadline);
        }

    }
}
