<!-- 个人主页 -->
<template>
    <ContentBase>
        <div class="row">
            <div class="col-4">
                <UserInfo />
            </div>
            <viv class="col-8">
                <ProblemHistory />
            </viv>
        </div>
        <div class="div-margin">
            <CalendarChart :width="'100%'" :height="'220px'" />
        </div>
    </ContentBase>
</template>;

<script>
import ContentBase from "../components/ContentBase.vue"
import UserInfo from "../components/UserInfo.vue"
import ProblemHistory from "../components/ProblemHistory.vue";
import CalendarChart from "@/components/CalendarChart.vue";

export default {
    name: 'UserProfile',
    components: {
        CalendarChart,
        ContentBase,
        UserInfo,
        ProblemHistory,
    },
}
</script>

<style scoped>

.div-margin{
    margin-top: -22px;
}
</style>
