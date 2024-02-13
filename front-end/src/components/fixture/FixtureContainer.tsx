import Matches from "./Matches"

const FixtureContainer = () => {
  return (
    <div className={`bg-silver-950 px-4 py-5 rounded-3xl`}>
      <section>
        <h2 className={`text-center text-2xl font-bauhs text-primary-500`}>FIXTURE</h2>
      </section>
      <section className="bg-primary-400 p-1 rounded-3xl ">
        <Matches/>
      </section>
    </div>
  )
}
export default FixtureContainer