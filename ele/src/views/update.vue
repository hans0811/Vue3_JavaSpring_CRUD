<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="120px" class="demo-ruleForm">
    <el-form-item label="Code" prop="id">
      <el-input v-model="ruleForm.id" readonly></el-input>
    </el-form-item>
    <el-form-item label="Name" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>
    <el-form-item label="Author" prop="author">
      <el-input v-model="ruleForm.author"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">Update</el-button>
      <el-button @click="resetForm('ruleForm')">Reset</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
const axios = require('axios');
export default {
  data() {
    return {
      ruleForm: {
        id: '',
        name: '',
        author: '',
      },
      rules: {
        name: [
          { required: true, message: 'Please input book name', trigger: 'blur' },
          { min: 3, max: 15, message: 'Length should be 3 to 5', trigger: 'blur' }
        ],
        Author: [
          { required: true, message: 'Please input author name', trigger: 'blur' },
          { min: 3, max: 5, message: 'Length should be 3 to 5', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          console.log(_this.ruleForm)
          axios.put('http://192.168.1.150:8181/book/update', _this.ruleForm).then(
              function(repos){
                console.log(repos);
              }
          )
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
  },
  created(){
    console.log("test");
    console.log(this.$route.query.id);
    const _this = this
    axios.get('http://192.168.1.150:8181/book/findById/' + (this.$route.query.id)).then(
        function(repo){
          console.log("test",repo);
          _this.ruleForm = repo.data
        }
    )
  }
}
</script>

<style scoped>

</style>