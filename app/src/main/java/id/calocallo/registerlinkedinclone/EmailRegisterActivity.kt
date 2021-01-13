package id.calocallo.registerlinkedinclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import id.calocallo.registerlinkedinclone.databinding.ActivityEmailRegisterBinding

class EmailRegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmailRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegisterEmail.setOnClickListener {
            if (binding.edtEmail.text.isNullOrBlank()) {
                Toast.makeText(this, "Masukkan Email atau Telepon Yang Benar", Toast.LENGTH_SHORT)
                    .show()
            } else if (!binding.edtEmail.text.isNullOrBlank()) {
                binding.btnRegisterPassword.visibility = View.VISIBLE
                binding.btnRegisterEmail.visibility = View.GONE
                binding.edtPassword.visibility = View.VISIBLE

            }
        }
        binding.btnRegisterPassword.setOnClickListener {
            if (binding.edtPassword.text.isNullOrBlank() || binding.edtPassword.text.length == 6) {
                Toast.makeText(this, "Password TIdak Boleh Kosong dan Harus Yang Lebih Kuat", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(this, "Berhasil Login", Toast.LENGTH_SHORT).show()
            }
        }
    }
}