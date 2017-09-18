package pe.virtualink.dialoglist;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by William_ST on 17/09/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    private List<Item> itemList;
    private ListAdapter.OnItemClickListener mListener;


    public ListAdapter(List<Item> items) {
        this.itemList = items;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, int position) {
        holder.bind(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);
        }

        public void bind(Item item){
            textView.setText(item.getCode()+" "+item.getName());
        }

        @Override
        public void onClick(View v) {
            if(mListener != null){
                mListener.OnItemClick(itemList.get(getAdapterPosition()));
            }
        }
    }

    public void setOnItemClickListener(ListAdapter.OnItemClickListener mListener) {
        this.mListener = mListener;
    }

    public interface OnItemClickListener{
        void OnItemClick(Item item);
    }
}
