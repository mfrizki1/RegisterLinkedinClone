package id.calocallo.registerlinkedinclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.calocallo.registerlinkedinclone.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding :ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNextName.setOnClickListener {
            if(binding.edtFirstName.text.isNullOrBlank()){
                Toast.makeText(this, "Masukkan Nama Depan", Toast.LENGTH_SHORT).show()
            }else if(binding.edtLastName.text.isNullOrBlank()){
                Toast.makeText(this, "Masukkan Nama Belakang", Toast.LENGTH_SHORT).show()
            }else{
                startActivity(Intent(this, EmailRegisterActivity::class.java))
            }
        }
    }
}