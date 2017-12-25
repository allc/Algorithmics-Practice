# Notes

- Binary search implementation issue

  This may cause overflow
  
  ```
  mid = (min + max) / 2; // this may cause overflow
  ```
  
  Use this instead
  
  ```
  mid = min + (max - min) / 2;
  ```
  
  Read more on Wikipedia: <https://en.wikipedia.org/wiki/Binary_search_algorithm#Implementation_issues>
