/*mutex_lock.h*/
/*C++*/
/*https://github.com/google/benchmark/blob/master/src/mutex_lock.h*/

#ifndef BENCHMARK_MUTEX_LOCK_H_
#define BENCHMARK_MUTEX_LOCK_H_

#include <pthread.h>

namespace benchmark {
class mutex_lock {
 public:
  explicit mutex_lock(pthread_mutex_t* mu) : mu_(mu) {
    pthread_mutex_lock(mu_);
  }

  ~mutex_lock() { pthread_mutex_unlock(mu_);  }

 private:
  pthread_mutex_t* mu_;
};
}

#endif  // BENCHMARK_MUTEX_LOCK_H_
