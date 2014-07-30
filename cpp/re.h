/*re.h*/
/*C++*/
/*https://github.com/google/benchmark/blob/master/src/re.h*/

#ifndef BENCHMARK_RE_H_
#define BENCHMARK_RE_H_

#if defined OS_FREEBSD
#include <gnuregex.h>
#else
#include <regex.h>
#endif
#include <string>

namespace benchmark {

class Regex {
 public:
  Regex();
  ~Regex();

  bool Init(const std::string& spec, std::string* error);

  bool Match(const std::string& str);
 private:
  bool init_;
  
  regex_t re_;
};

}

#endif  // BENCHMARK_RE_H_