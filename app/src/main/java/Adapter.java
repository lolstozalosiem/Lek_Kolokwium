import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.student.dominikagaborkolokwium.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by student on 2018-01-15.
 */

// przygotowanie Adaptera dla RecyclerView
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
// przygotowanie ViewHolder dla RecyclerView
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            // wykorzystanie butterknifa w viewholderze
            ButterKnife.bind(this, itemView);
        }

    // ustawienie nazwy leku oraz jego dawki
      @BindView(R.id.nazwa)
      TextView ItemNazwa;

      @BindView(R.id.dawka)
      TextView ItemDawka;


        private void setItemName(String nazwa){
            ItemNazwa.setText(nazwa);
        }

        private void setItemDawka(Integer dawka)
        {
            ItemDawka.setText(dawka);
        }
    }
}


