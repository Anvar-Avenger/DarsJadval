package uz.anvar.darsjadvali.holder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import uz.anvar.darsjadvali.R;

public class WeekDaysViewHolder extends RecyclerView.ViewHolder {

    TextView day_name, day;
    LinearLayout week_day_layout;

    public WeekDaysViewHolder(@NonNull View itemView) {
        super(itemView);

        day_name = itemView.findViewById(R.id.day_name);
        day = itemView.findViewById(R.id.day);
        week_day_layout = itemView.findViewById(R.id.week_day_layout);
    }

    public void setDayName(String name) {
        day_name.setText(name);
    }

    public void setDay(String num) {
        day.setText(num);
    }

    public void setActive() {
        day.setTextColor(day.getContext().getResources().getColor(R.color.inactive_text));
        week_day_layout.setBackground(week_day_layout.getResources().getDrawable(R.drawable.dr_active_text));
    }
}