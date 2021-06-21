<template>
<router-view></router-view>
</template>
<!--<template>-->
<!--  <el-container style="height: 500px; border: 1px solid #eee">-->
<!--    <el-aside width="200px" style="background-color: rgb(238, 241, 246)">-->
<!--      <el-menu :default-openeds="['1']" :default-active="['1-1']">-->
<!--        <el-submenu index="1">-->
<!--          <template #title><i class="el-icon-message"></i>Navigator One</template>-->
<!--          <el-menu-item-group>-->
<!--            <el-menu-item index="1-1">Option 1</el-menu-item>-->
<!--            <el-menu-item index="1-2">Option 2</el-menu-item>-->
<!--            <el-submenu index="2">-->
<!--              <template #title><i class="el-icon-menu"></i>Navigator Two</template>-->
<!--              <el-menu-item-group>-->
<!--                <el-menu-item index="2-1">Option 1</el-menu-item>-->
<!--                <el-menu-item index="2-2">Option 2</el-menu-item>-->
<!--              </el-menu-item-group>-->
<!--            </el-submenu>-->
<!--          </el-menu-item-group>-->
<!--        </el-submenu>-->

<!--      </el-menu>-->

<!--      <el-menu>-->
<!--        <el-submenu v-for="(item, index) in $router.options.routes" :index="index+''">-->
<!--          <template #title><i class="el-icon-message"></i>{{ item.name }}</template>-->
<!--          <el-menu-item v-for="(item2,index2) in item.children" :index="index + '-' + index2">{{ item2.name }}</el-menu-item>-->
<!--        </el-submenu>-->
<!--      </el-menu>-->
<!--    </el-aside>-->

<!--    <el-container>-->
<!--      <el-header style="text-align: right; font-size: 12px">-->
<!--        <el-dropdown>-->
<!--          <i class="el-icon-setting" style="margin-right: 15px"></i>-->
<!--          <template #dropdown>-->
<!--            <el-dropdown-menu>-->
<!--              <el-dropdown-item>View</el-dropdown-item>-->
<!--              <el-dropdown-item>Add</el-dropdown-item>-->
<!--              <el-dropdown-item>Delete</el-dropdown-item>-->
<!--            </el-dropdown-menu>-->
<!--          </template>-->
<!--        </el-dropdown>-->
<!--        <span>Tom</span>-->
<!--      </el-header>-->

<!--      <el-main>-->
<!--        <router-view></router-view>-->
<!--      </el-main>-->
<!--    </el-container>-->
<!--  </el-container>-->

<!--</template>-->

<script>
export default {
  data() {
    const item = {
      date: '2016-05-02',
      name: 'Tom',
      address: 'No. 189, Grove St, Los Angeles'
    };
    return {
      tableData: Array(20).fill(item)
    }
  }
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.el-header {
  background-color: #B3C0D1;
  color: #333;
  line-height: 60px;
}

.el-aside {
  color: #333;
}
</style>
