<template>

<div>
  <el-table
      :data="tableData"
      style="width: 100%">
    <el-table-column
        fixed
        prop="id"
        label="code"
        width="150">
    </el-table-column>
    <el-table-column
        prop="name"
        label="Name"
        width="120">
    </el-table-column>
    <el-table-column
        prop="author"
        label="State"
        width="120">
    </el-table-column>
    <el-table-column
        fixed="right"
        label="Operations"
        width="120">
      <template #default="scope">
        <el-button @click="update(scope.row)" type="text" size="small">update</el-button>
        <el-button @click="deleteBook(scope.row)" type="text" size="small">delete</el-button>
      </template>
    </el-table-column>
  </el-table>
  <el-pagination
      background
      layout="prev, pager, next"
      page-size="6"
      :total= total
      @current-change="page">
  </el-pagination>
</div>

</template>

<script>
const axios = require('axios');
export default {
  methods: {
    update(row) {
      console.log(row);

      this.$router.push({
              path: '/update',
        query:{
                id:row.id
        }

      })
    },
    deleteBook(row){
      axios.delete('http://localhost:8181/book/deleteById/' + row.id)
    },
    page(currentPage){
      const _this = this
      axios.get('http://localhost:8181/book/findAll/'+currentPage+'/6')
          .then(function(repo){
            console.log(repo.data);
            _this.tableData = repo.data.content
            _this.total = repo.data.totalElements

          })

    }
  },
  created() {
    const _this = this
    axios.get('http://localhost:8181/book/findAll/1/6')
        .then(function(repo){
          console.log(repo.data);
          _this.tableData = repo.data.content
          _this.total = repo.data.totalElements

        })

  },
  data() {
    return {
      total: null,
      tableData: null
    }
  }
}
</script>

<style>

</style>
