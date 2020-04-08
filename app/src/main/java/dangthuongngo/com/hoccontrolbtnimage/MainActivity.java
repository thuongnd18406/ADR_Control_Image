package dangthuongngo.com.hoccontrolbtnimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import dangthuongngo.com.hoccontrolbtnimage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(R.layout.activity_main);
        addEvents();

    }

    private void addEvents() {

        binding.btnHoaHong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //đổi hình khác (Hoa Hồng)
                //Vì hoa hồng là hinhg offline đc đính kèm trong Project
                //ta dùng id của nó:
                binding.imgHoa.setImageResource(R.drawable.mehienhung);
            }

        });

        binding.btnHoaCuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiDoiHinh(R.drawable.mepture);
                //binding.imgHoa.setImageResource(R.drawable.meCapture);
            }
        });

        binding.btnHoaLan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiDoiHinh(R.drawable.menquyen);
//                binding.imgHoa.setImageResource(R.drawable.meHienNhung);
            }
        });
        binding.btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void xuLiDoiHinh(int  id) {
        //binding.imgHoa.setImageResource(id);
        binding.imgHoa.setBackgroundResource(id);

    }
}
