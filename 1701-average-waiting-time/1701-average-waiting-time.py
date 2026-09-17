class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        arrival_time = customers[0][0]
        finish_time = customers[0][1]
        prepare_time = arrival_time + finish_time
        average_wait = prepare_time - arrival_time

        for i in range(1, len(customers)):
            arrive = customers[i][0]
            finish = customers[i][1]
            if prepare_time < arrive:
                prepare_time = arrive
            prepare_time += finish
            average_wait += prepare_time - arrive
        return average_wait / len(customers)